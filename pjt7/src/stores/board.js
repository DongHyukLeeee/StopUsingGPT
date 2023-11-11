import { ref } from 'vue'
import { defineStore } from 'pinia'
import axios from 'axios'

export const useBoardStore = defineStore('board', () => {
  const boardList = ref([])

  const getBoardList = function(){
    axios.get('http://localhost:8080/main-api/')
    // axios.get('http://localhost:8080/api/board')
    .then((res)=>{
      console.log(res)
      boardList.value = res.data
    })
    .catch((error) => {
      console.error("Error fetching data: ", error);
    });
  }
  return{
    boardList, getBoardList
  }
})
