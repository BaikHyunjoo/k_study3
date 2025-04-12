import { createRouter, createWebHashHistory } from 'vue-router';

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      component: () => import('../components/pages/Index.vue'),
    },
    {
      path: '/orders',
      component: () => import('../components/ui/OrderGrid.vue'),
    },
    {
      path: '/deliveries',
      component: () => import('../components/ui/DeliveryGrid.vue'),
    },
    {
      path: '/inverntories',
      component: () => import('../components/ui/InverntoryGrid.vue'),
    },
  ],
})

export default router;
