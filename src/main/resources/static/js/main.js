

Vue.component('messages-list', {
    props: ['messages'],
    template: '<div><div v-for="message in messages">{{message.text}}</div></div>'
});

var app = new Vue({
    el: '#app',
    template: '<messages-list :messages="messages" />',
    data: {
        messages: [
            { id: '1', text: 'Horny'},
            { id: '2', text: 'Swallow'},
            { id: '3', text: 'Latex'}
        ]
    }
});