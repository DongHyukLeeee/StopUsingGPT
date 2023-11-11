<template>
  <div>
    <h2>회원가입</h2>
    <fieldset>
      <label for="id">아이디</label>
      <input type="text" id="id" v-model="id" />
      <label for="pw">비밀번호</label>
      <input type="password" id="pw" v-model="pw" />
      <label for="pw2">비밀번호 확인</label>
      <input type="password" id="pw2" v-model="pw2" />
      <label for="nickname">닉네임</label>
      <input type="text" id="nickname" v-model="nickname" />
      <button @click="regist">등록</button>
    </fieldset>
  </div>
</template>

<script setup>
import { ref } from "vue";
import axios from "axios";
import { useRouter } from "vue-router";

const router = useRouter();
const emit = defineEmits(["create-user"]);

const id = ref("");
const pw = ref("");
const pw2 = ref("");
const nickname = ref("");
const users = ref([]);

const getUserList = () => {
  const API_URL = `http://localhost:8080/user-api`;
  axios({
    url: API_URL,
    method: "GET",
  })
    .then((res) => {
      users.value = Array.isArray(res.data) ? res.data : [];
    })
    .catch((err) => {
      console.log(err);
    });
};

const regist = () => {
  getUserList();

  if (pw.value != pw2.value) {
    alert("비밀번호가 일치하지 않습니다.");
  } else if (users.value.some((users) => users.id === id.value)) {
    alert("이미 존재하는 아이디입니다.");
  } else {
    const user = {
      id: id.value,
      pw: pw.value,
      nickname: nickname.value,
    };

    emit("create-user", user);
  }
};

getUserList();
</script>

<style scoped></style>
