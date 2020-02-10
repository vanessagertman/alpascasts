<template>
    <div class="flex flex-col w-1/2  m-2 bg-white border rounded-lg overflow-hidden">
        <a :href="playlistRoute" class="line-height-2">
        <img class="h-48 bg-center bg-cover" :src="playlist.playlist.imagePath" :alt="playlist.playlist.alt">
        <div class="p-6 bg-gray-400">
            <h4 class="mt-1 font-semibold text-xl leading-tight truncate">{{playlist.playlist.title}}</h4>
            <div class="mt-1">
                {{playlist.playlist.description}}
            </div>
        </div>
        </a>
    </div>
</template>
<script>
    export default {
        props: {
            playlist: { required: true},
            // playlistRoute: { required: true},
        },
        computed: {
            playlistRoute()
            {
                return`/playlists/${this.playlist.playlist.id}/videos/${this.playlist.video.id}`
            }
        }
    }
</script>

<style scoped>

</style>
