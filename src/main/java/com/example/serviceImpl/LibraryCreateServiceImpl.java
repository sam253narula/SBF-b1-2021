package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Library;
import com.example.repository.LibraryRepository;

@Service
public class LibraryCreateServiceImpl implements LibraryCreateService {

	@Autowired
	LibraryRepository libraryRepository;
	
	@Override
	public String addSingleLibrary(Library library) {
		libraryRepository.save(library);
		libraryRepository.flush();
		return "Library saved";
	}
	
	@Override
	public String addAllLibraries(List<Library> libraries) {
//		libraryRepository.saveAll(libraries);
//		libraryRepository.flush();
		libraryRepository.saveAllAndFlush(libraries);
		return "All Libraries are Saved";
	}
	
	@Override
	public Library addLibrararywithSaveAndFlush(Library library) {
		return libraryRepository.saveAndFlush(library);
	}
}



