
var projectName = '高校失物招领系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '拾物信息',
	url: './pages/shiwuxinxi/list.html'
}, 
{
	name: '寻物信息',
	url: './pages/xunwuxinxi/list.html'
}, 

{
	name: '公告信息',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springbootuh9pj/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["新增","查看","修改","删除"],"menu":"保管员","menuJump":"列表","tableName":"baoguanyuan"}],"menu":"保管员管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看","删除"],"menu":"拾物信息","menuJump":"列表","tableName":"shiwuxinxi"}],"menu":"拾物信息管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["删除","查看"],"menu":"寻物信息","menuJump":"列表","tableName":"xunwuxinxi"}],"menu":"寻物信息管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["新增","查看","修改","删除"],"menu":"物品分类","menuJump":"列表","tableName":"wupinfenlei"}],"menu":"物品分类管理"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","删除"],"menu":"认领信息","menuJump":"列表","tableName":"renlingxinxi"}],"menu":"认领信息管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["删除","查看"],"menu":"拾物举报","menuJump":"列表","tableName":"shiwujubao"}],"menu":"拾物举报管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","删除"],"menu":"寻物举报","menuJump":"列表","tableName":"xunwujubao"}],"menu":"寻物举报管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["删除","查看"],"menu":"成功记录","menuJump":"列表","tableName":"chenggongjilu"}],"menu":"成功记录管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"},{"appFrontIcon":"cuIcon-send","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","认领","举报"],"menu":"拾物信息列表","menuJump":"列表","tableName":"shiwuxinxi"}],"menu":"拾物信息模块"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["举报","查看评论","查看"],"menu":"寻物信息列表","menuJump":"列表","tableName":"xunwuxinxi"}],"menu":"寻物信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","修改","删除"],"menu":"认领信息","menuJump":"列表","tableName":"renlingxinxi"}],"menu":"认领信息管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","修改","删除"],"menu":"拾物举报","menuJump":"列表","tableName":"shiwujubao"}],"menu":"拾物举报管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","修改","删除"],"menu":"寻物举报","menuJump":"列表","tableName":"xunwujubao"}],"menu":"寻物举报管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看"],"menu":"成功记录","menuJump":"列表","tableName":"chenggongjilu"}],"menu":"成功记录管理"},{"child":[{"appFrontIcon":"cuIcon-favor","buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","认领","举报"],"menu":"拾物信息列表","menuJump":"列表","tableName":"shiwuxinxi"}],"menu":"拾物信息模块"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["举报","查看评论","查看"],"menu":"寻物信息列表","menuJump":"列表","tableName":"xunwuxinxi"}],"menu":"寻物信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["新增","查看","修改","删除"],"menu":"拾物信息","menuJump":"列表","tableName":"shiwuxinxi"}],"menu":"拾物信息管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除","查看评论"],"menu":"寻物信息","menuJump":"列表","tableName":"xunwuxinxi"}],"menu":"寻物信息管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看"],"menu":"物品分类","menuJump":"列表","tableName":"wupinfenlei"}],"menu":"物品分类管理"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","审核","记录"],"menu":"认领信息","menuJump":"列表","tableName":"renlingxinxi"}],"menu":"认领信息管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","审核"],"menu":"拾物举报","menuJump":"列表","tableName":"shiwujubao"}],"menu":"拾物举报管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","审核"],"menu":"寻物举报","menuJump":"列表","tableName":"xunwujubao"}],"menu":"寻物举报管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","修改","删除"],"menu":"成功记录","menuJump":"列表","tableName":"chenggongjilu"}],"menu":"成功记录管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","认领","举报"],"menu":"拾物信息列表","menuJump":"列表","tableName":"shiwuxinxi"}],"menu":"拾物信息模块"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["举报","查看评论","查看"],"menu":"寻物信息列表","menuJump":"列表","tableName":"xunwuxinxi"}],"menu":"寻物信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"保管员","tableName":"baoguanyuan"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
