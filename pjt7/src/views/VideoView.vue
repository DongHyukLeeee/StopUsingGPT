<template>
    <div class="video-container">

      <iframe
        v-if="youtubeId"
        :src="'https://www.youtube.com/embed/' + youtubeId"
        frameborder="0"
        allowfullscreen>
      </iframe>
    </div>
  </template>
  
  <script setup>
  import { ref, onMounted } from 'vue';
  import { useRoute } from 'vue-router';
  
  const route = useRoute();
  const youtubeId = ref('');
  
  onMounted(() => {
    youtubeId.value = route.params.youtubeId;
  });
  </script>
  
  <style scoped>
  .video-container {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 60vh; /* 높이는 필요에 따라 조절 */
  }
  
  iframe {
    width: 70%; /* 너비는 필요에 따라 조절 */
    height: 100%;
  }
  </style>
  