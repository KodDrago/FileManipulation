package main.files;

import java.io.File;

public class Drives {
	
	private File[] drives;
	private File drive;
	
	private File[] dirs;
	private File dir;
	
	public Drives() {
		System.out.println("Start Drive Discovery");
		findDrives();
		for(int i=0;i<drives.length;i++) {
			System.out.println(drives[i]);
		}
		findDirectories(new File("D:\\"));
		for(int i=0;i<dirs.length;i++) {
			System.out.println(dirs[i]);
		}
	}
	
	
	
	private void findDrives() {
		drives=null;
		
		drives=File.listRoots();

	}
	
	/*private void findDirectories(File drive) {
		dirs=null;
		
		dirs=File.listRoots();
		
		for(File dir:dirs) {
			findDirectories(dir);
		}
	}*/
	
	
	private File[] findDirectories(File drive) {
		File[] folders=null;
		
		try{
			if(!drive.isDirectory()) {
				System.out.println("This is the only Folder");
			}else {
				folders=drive.listFiles();
				for(File folder:folders) {
					if(folder.isDirectory()) {
						findDirectories(folder);
					}else {
						System.out.println("Func Test"+folder.getName());
					}
				}
			}
		}catch(Exception e) {
				System.out.println(e.toString());
		}
		return folders;
	}
	
	
	
	private void enterDir(File dir) {
		
	}
}
