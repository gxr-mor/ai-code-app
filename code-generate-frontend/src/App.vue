<script setup lang="ts">
import BasicLayout from '@/layouts/BasicLayout.vue'
import { testCheck } from './api/testController'
testCheck().then((res) => {
  console.log('res', res)
})
</script>

<template>
  <BasicLayout />
</template>

<style></style>
