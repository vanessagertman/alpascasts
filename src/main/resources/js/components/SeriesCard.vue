<template>
    <div class="flex flex-col w-1/2  m-2 bg-white border rounded-lg overflow-hidden">
        <img class="h-48 bg-center bg-cover" :src="image" :alt="alt">
        <div class="p-6 bg-gray-400">
            <h4 class="mt-1 font-semibold text-xl leading-tight truncate">{{title}}</h4>
            <div class="mt-1">
                {{description}}
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        props: {
            title: { type: String, required: true },
            description: { type: String, required: true },
            image: {type: String, required: true},
            alt: {type: String, required: true}
            },
    }
</script>

<style scoped>

</style>
