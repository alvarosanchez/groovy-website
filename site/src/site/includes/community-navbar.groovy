
ul(class: 'nav-sidebar') {
    [
            'community': 'Community',
            'contribute': 'Contribute',
            'mailing-lists': 'Mailing-lists',
            'events': 'Events',
            'hipchat': 'Chat',
            'groovy-weekly': 'Groovy Weekly newsletter'
    ].each { page, label ->
        if (currentPage == page) {
            li(class: 'active') { a(href: "${page}.html") { strong(label) } }
        } else {
            li { a(href: "${page}.html", label) }
        }
    }
    li { a(href: "groovy-weekly.html#subscribe", class: 'anchor-link', 'Subscribe') }
    li { a(href: "groovy-weekly.html#archives", class: 'anchor-link', 'Archive') }
}
br()
include unescaped: 'html/twittersearch.html'
