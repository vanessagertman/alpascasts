<template>
    <span v-html="markdown" v-if="description !== ''">markdown</span>
</template>

<script>
    const md = require('markdown-it')({
        html: true,
        linkify: true,
    }).disable(['blockquote', 'html_block', 'lheading', 'reference', 'html_inline'])
    export default {
        props: ['description'],
        computed: {
            markdown() {
                return !!this.description ? md.render(this.description) : ''
            },
        },
    }
</script>

