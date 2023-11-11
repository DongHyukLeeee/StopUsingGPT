import { createRouter, createWebHistory } from "vue-router";

import HomeView from "@/views/HomeView.vue";
import VideoView from "@/views/VideoView.vue";
import LoginView from "@/views/LoginView.vue";
import SignupView from "@/views/SignupView.vue";
import LoginForm from "@/components/user/LoginForm.vue";
import UserDetail from "@/components/user/UserDetail.vue";
import UserRegist from "@/components/user/UserRegist.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      name: "home",
      component: HomeView,
    },
    {
      path: "/video/:youtubeId",
      name: "video",
      component: VideoView,
    },


    {
      path: "/video/login",
      name: "login",
      component: LoginView,
    },
    {
      path: "/video/signup",
      name: "signup",
      component: SignupView,
    },
    {
      path: "/user/login",
      name: "Login",
      component: LoginForm,
    },
    // {
    //   path: "/user",
    //   component: User,
    //   children: [
    //     {
    //       path: "regist",
    //       name: "Regist",
    //       component: UserRegist,
    //     },
    //     {
    //       path: "",
    //       name: "Update",
    //       component: UserDetail,
    //     },
    //   ],
    // },
  ],
});

export default router;
