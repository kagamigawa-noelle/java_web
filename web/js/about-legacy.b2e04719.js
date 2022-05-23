"use strict";
(self["webpackChunkkeshe"] = self["webpackChunkkeshe"] || []).push([
    [443], { 38091: function(t, e, n) { n.r(e), n.d(e, { default: function() { return d } }); var i = function() { var t = this,
                        e = t.$createElement,
                        n = t._self._c || e; return n("div", { staticClass: "about" }, [n("el-button", { staticClass: "bt", attrs: { icon: "el-icon-s-home", size: "mini" }, on: { click: t.back } }, [t._v("返回主页")]), n("div", { staticClass: "input" }, [n("el-input", { staticClass: "input-with-select", attrs: { placeholder: "请输入内容" }, on: { keyup: function(e) { return !e.type.indexOf("key") && t._k(e.keyCode, "enter", 13, e.key, "Enter") ? null : t.search.apply(null, arguments) } }, model: { value: t.input3, callback: function(e) { t.input3 = e }, expression: "input3" } }, [n("el-button", { attrs: { slot: "append", icon: "el-icon-search" }, on: { click: t.search }, slot: "append" }, [t._v("搜索")])], 1)], 1), n("el-divider"), n("div", { staticClass: "main" }, t._l(t.videos, (function(e, i) { return n("Video", { key: i, attrs: { up: e.author, date: e.date, title: e.title, img: e.cover }, nativeOn: { click: function(n) { return t.goto(e) } } }) })), 1), n("Bottom")], 1) },
                a = [],
                s = n(16198),
                r = (n(78975), n(41566)),
                o = n(42233),
                u = { components: { Video: r.Z, Bottom: o.Z }, data: function() { return { input3: "", videos: [] } }, created: function() { this.getData(this.$route.query.keyword) }, methods: { getData: function(t) { var e = this; return (0, s.Z)(regeneratorRuntime.mark((function n() { var i, a; return regeneratorRuntime.wrap((function(n) { while (1) switch (n.prev = n.next) {
                                        case 0:
                                            return n.next = 2, e.$axios.get("/api/search", { params: { keywords: t } });
                                        case 2:
                                            i = n.sent, a = i.data, e.videos = a.data;
                                        case 5:
                                        case "end":
                                            return n.stop() } }), n) })))() }, goto: function(t) { this.$router.push({ path: "/video", query: { id: t } }) }, search: function() { this.getData(this.input3) }, back: function() { this.$router.push({ path: "/" }) } } },
                c = u,
                l = n(1001),
                p = (0, l.Z)(c, i, a, !1, null, "6c6c687f", null),
                d = p.exports } }
]);
//# sourceMappingURL=about-legacy.b2e04719.js.map