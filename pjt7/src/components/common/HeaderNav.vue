<template>
  <div>
    <div v-if="puser">
      <RouterLink to="Login">로그인</RouterLink>
      <RouterLink to="Regist">회원가입</RouterLink>
    </div>
    <div v-else>
      <RouterLink to="Update">회원 정보 수정</RouterLink>
      <a @click="logout">로그아웃</a>
      <a @click="delete">회원탈퇴</a>
    </div>
  </div>
</template>

<script setup>
const emits = defineEmits(["logout", "delete"]);

const logout = () => {
  emits("logout");
  emits;
};
</script>

<style scoped></style>
