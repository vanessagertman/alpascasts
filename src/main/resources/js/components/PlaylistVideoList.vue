<template>
    <div>
        <div v-for="video in videos">
            <a :href="videoRoute(video)">

            <div class=" mt-4 m-2 bg-white overflow-hidden flex flex-row bg-gray-400"
            v-bind:class="videoIsCurrent(video) ? 'border-indigo-600 border-4' : 'border'">
                <div class="bg-blue-700 text-white text-3xl p-3">{{video.order}}</div>
                <div class="text-xl mt-4 ml-2">{{video.video.title}}</div>

            </div>
            </a>
        </div>

    </div>
</template>

<script>
    export default {
        props: {
            videos: {required: true},
            current: {required: true},
            // playlistRoute: { required: true},
        },
        computed: {
            // playlistRoute()
            // {
            //     return`/playlists/${this.playlist.playlist.id}/videos/${this.playlist.video.id}`
            // }
        },
        methods: {
            videoIsCurrent(video){
                return this.current == video.video.id
            },
            videoRoute(video)
            {
                return`/playlists/${video.playlist.id}/videos/${video.video.id}`
            }
        }
    }
</script>

<style scoped>

</style>
