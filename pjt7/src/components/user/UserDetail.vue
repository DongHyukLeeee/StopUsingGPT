<template>
  <div>
    <h2>회원정보 수정</h2>
    <fieldset>
      <label for="id">아이디</label>
      <input readonly type="text" id="id" v-model="user.id" />
      <label for="pw">비밀번호</label>
      <input type="password" id="pw" v-model="user.pw" />
      <label for="nickname">닉네임</label>
      <input type="text" id="nickname" v-model="user.nickname" />
      <button @click="updateUser">수정</button>
    </fieldset>
  </div>
</template>

<script setup>
import { ref, onMounted } from "vue";
import axios from "axios";

const emit = defineEmits(["update-user"]);

const user = ref({
  id: "",
  pw: "",
  nickname: "",
});

const updateUser = () => {
  emit("update-user", user.value);
};

onMounted(() => {
  const API_URL = `http://localhost:8080/user-api`;
  axios({
    url: API_URL,
    method: "GET",
    withCredentials: true
  })
    .then((res) => {
      user.value.id = res.data.id;
      user.value.pw = res.data.pW;
      user.value.nickname = res.data.nickname;
    })
    .catch((err) => {
      console.log(err);
    });
});
</script>

<style scoped></style>
