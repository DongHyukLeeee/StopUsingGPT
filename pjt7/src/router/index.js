import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '@/views/HomeView.vue'
import VideoView from '@/views/VideoView.vue'
import ReviewView from '@/views/ReviewView.vue'
import LoginView from '@/views/LoginView.vue'
import SignupView from '@/views/SignupView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/video/:videoId',
      name: 'video',
      component: VideoView
      
    },
    {
      path: '/video/:videoId/:reviewView',
      name: 'review',
      component: ReviewView
    },
    {
      path: '/video/login',
      name: 'login',
      component: LoginView
    },
    {
      path: '/video/signup',
      name: 'signup',
      component: SignupView
    }
  ]
})

export default router
