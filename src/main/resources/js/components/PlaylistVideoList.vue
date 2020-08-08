<template>
    <div>
        <div v-for="video in videos">
            <hr class="my-4">
            <a :href="videoRoute(video)">

            <div class=" mt-4 m-2 overflow-hidden flex flex-row"
            >
                <div >
                    <div v-if="videoIsCurrent(video)" class="rounded-full h-12 w-12 flex items-center justify-center bg-ac-blue text-ac-blue font-extrabold">
                        <img  src="/current_video.svg"></img>
                    </div>
                    <div v-else class="rounded-full h-12 w-12 flex items-center justify-center bg-ac-gray-blue text-ac-blue font-extrabold">
                        <div v-if="(video.order < 10)">0</div>
                        {{video.order}}
                    </div>
                </div>
                <div class="ml-2 flex items-center justify-center">{{video.video.title}}</div>

            </div>
            </a>
        </div>
        <hr class="mt-4">
    </div>
</template>

<script>
    export default {
        props: {
            videos: {required: true},
            current: {required: true},
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
