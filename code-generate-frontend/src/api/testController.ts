// @ts-ignore
/* eslint-disable */
import request from '@/request'

/** 此处后端没有提供注释 GET /test/ */
export async function testCheck(options?: { [key: string]: any }) {
  return request<API.BaseResponseString>('/test/', {
    method: 'GET',
    ...(options || {}),
  })
}
