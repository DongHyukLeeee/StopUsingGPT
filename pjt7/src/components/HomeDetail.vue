<template>
    <div>
       <h4>홈디테일(동영상목록)</h4> 
       <hr>
       <table>
            <tr>
                <th>youtube_id </th>
                <th>channel_name</th>
                <th>view_cnt</th>
                <th>fit_part_name</th>
                <th>title</th>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
       </table>
    </div>
</template>

<script setup>
import {useBoardStore} from "@/stores/board"
import { onMounted } from "vue";
const store = useBoardStore()
onMounted (()=>{
    store.getBoardList();
})
</script>

<style scoped>

</style>