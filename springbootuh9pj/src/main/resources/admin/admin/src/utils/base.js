const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootuh9pj/",
            name: "springbootuh9pj",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootuh9pj/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校失物招领系统"
        } 
    }
}
export default base
