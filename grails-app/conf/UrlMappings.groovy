class UrlMappings {

	static mappings = {

        "/invader/$name"(controller: "invader")

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
