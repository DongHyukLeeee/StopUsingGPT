import { ref, computed } from 'vue'
import { defineStore } from 'pinia'
import axios from 'axios'

export const useBoardStore = defineStore('board', () => {
  const boardList = ref([])

  const getBoardList = function(){
    axios.get('http://localhost:8080/board-api/board')
    .then((res)=>{
      boardList.value = res.data
    })
  }
  return{
    boardList, getBoardList
  }
})
