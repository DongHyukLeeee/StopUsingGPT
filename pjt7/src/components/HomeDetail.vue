<template>
    <div>
      <h4>홈디테일(동영상목록)</h4>
      <hr>
      <div class="video-grid">
        <div class="video-item" v-for="video in store.boardList" :key="video.youtubeId">
          <iframe
            :src="'https://www.youtube.com/embed/' + video.youtubeId"
            frameborder="0"
            allowfullscreen>
          </iframe>
          <router-link :to="{ name: 'video', params: { youtubeId: video.youtubeId }}">
            {{ video.title }}
          </router-link>
        </div>

      </div>
      
    </div>

  </template>
  
  <script setup>
  import {useBoardStore} from "@/stores/board"
  import { onMounted } from "vue";
  import { RouterLink } from 'vue-router';
  
  const store = useBoardStore()
  onMounted (()=>{
      store.getBoardList();
  })
  </script>

<style scoped>
.video-grid {
  display: flex;
  flex-wrap: wrap;
  gap: 10px;
}

.video-item {
  flex: 1 1 calc(25% - 10px); /* 4열 구성 */
  max-width: calc(25% - 10px); /* 4열 구성 */
}

iframe {
  width: 100%;
  height: 200px; /* 원하는 높이로 조절 */
}
</style>