package net.charlie.albumsController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.charlie.model.Album;
import net.charlie.service.IAlbumsService;

@RestController
@RequestMapping("/api")
public class AlbumController {
		@Autowired
		private IAlbumsService serviceAlbum;
		
		@GetMapping("/albums")
		public List<Album> buscarTodo(){
			return serviceAlbum.buscartodo();
		}
}
