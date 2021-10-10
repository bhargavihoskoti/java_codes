package com.training.ifaces;

import com.training.model.Boook;
import java.io.IOException;

public interface BookService {
	
	public boolean write(Boook book) throws IOException;
	public Boook[] read() throws IOException;

}
