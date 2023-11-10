import { createRouter, createWebHistory } from 'vue-router';
import HomeView from '../views/Home.vue';
import Review from '../views/Review.vue';

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/review',
    name: 'review',
    component: Review
  }
];

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes
});

export default router;
