<template>
  <div>
    <h2>로그인</h2>
    <fieldset class="text-cemter">
      <label for="id">아이디</label>
      <input type="text" id="id" v-model="id" />
      <label for="pw">비밀번호</label>
      <input type="password" id="pw" v-model="pw" />
      <button @click="login">로그인</button>
    </fieldset>
  </div>
</template>

<script setup>
import { ref } from "vue";

const id = ref("");
const pw = ref("");

const emit = defineEmits(["loginUser"]);

const login = () => {
  let user = {
    id: id.value,
    pw: pw.value,
  };
  emit("loginUser", user);
};
</script>

<style scoped></style>
