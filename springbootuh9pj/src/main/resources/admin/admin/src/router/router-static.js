import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import renlingxinxi from '@/views/modules/renlingxinxi/list'
    import discussxunwuxinxi from '@/views/modules/discussxunwuxinxi/list'
    import shiwuxinxi from '@/views/modules/shiwuxinxi/list'
    import chenggongjilu from '@/views/modules/chenggongjilu/list'
    import shiwujubao from '@/views/modules/shiwujubao/list'
    import storeup from '@/views/modules/storeup/list'
    import xunwuxinxi from '@/views/modules/xunwuxinxi/list'
    import wupinfenlei from '@/views/modules/wupinfenlei/list'
    import yonghu from '@/views/modules/yonghu/list'
    import xunwujubao from '@/views/modules/xunwujubao/list'
    import config from '@/views/modules/config/list'
    import baoguanyuan from '@/views/modules/baoguanyuan/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/renlingxinxi',
        name: '认领信息',
        component: renlingxinxi
      }
      ,{
	path: '/discussxunwuxinxi',
        name: '寻物信息评论',
        component: discussxunwuxinxi
      }
      ,{
	path: '/shiwuxinxi',
        name: '拾物信息',
        component: shiwuxinxi
      }
      ,{
	path: '/chenggongjilu',
        name: '成功记录',
        component: chenggongjilu
      }
      ,{
	path: '/shiwujubao',
        name: '拾物举报',
        component: shiwujubao
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/xunwuxinxi',
        name: '寻物信息',
        component: xunwuxinxi
      }
      ,{
	path: '/wupinfenlei',
        name: '物品分类',
        component: wupinfenlei
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/xunwujubao',
        name: '寻物举报',
        component: xunwujubao
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/baoguanyuan',
        name: '保管员',
        component: baoguanyuan
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
