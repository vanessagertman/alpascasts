import Vue from 'vue'
import axios from 'axios'
import SeriesCard from "./components/SeriesCard";
import PlaylistVideoList from "./components/PlaylistVideoList";

window.axios = axios
window.axios.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest'


new Vue({
    el: '#app',
    components: {
        SeriesCard,
        PlaylistVideoList
    }
})
