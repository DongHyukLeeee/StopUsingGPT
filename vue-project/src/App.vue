<template>
  <div>
    <h2>App.vue</h2>
    <nav>
      <router-link to="/">Home</router-link>
      <router-link to="/review">Review</router-link>
    </nav>
    <router-view></router-view>
  </div>
</template>

<script setup>
</script>

<style scoped>
nav a {
  margin-right: 10px;
}
</style>
