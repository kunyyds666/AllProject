// 查询列表接口
const getUsedCarPage = (params) => {
  return $axios({
    url: '/usedCar/page',
    method: 'get',
    params
  })
}
// 删除接口
const deleteUsedCar = (ids) => {
    return $axios({
        url: '/usedCar',
        method: 'delete',
        params: { ids }
    })
}



const addUsedCar = (params) => {
    return $axios({
        url: '/usedCar/add',
        method: 'post',
        data: { ...params }
    });
};

const updateUsedCar = (params) => {
    return $axios({
        url: '/usedCar/update',
        method: 'put',
        data: { ...params }
    });
};

const queryUsedCarById = (id) => {
    return $axios({
        url: `/usedCar/${id}`,
        method: 'get'
    });
};








// 修改接口


// 新增接口





