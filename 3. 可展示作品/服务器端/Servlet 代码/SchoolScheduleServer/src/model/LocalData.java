package model;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by PC on 2015-06-01.
 */
public class LocalData {
	private ArrayList<File> filesList = new ArrayList<File>();
	private static String appData = "";

	public LocalData(HttpServletRequest request, String user) {
		appData = request.getSession().getServletContext()
				.getRealPath("/multimsg/" + user);
	}

	public ArrayList<File> getFilesList() {
		getLocalDataPath();
		return filesList;
	}

	private void getLocalDataPath() {
		browse(appData);

	}

	private void browse(String path) {
		File file = new File(path);

		FileFilter fileFilter = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				if (!pathname.isDirectory()) {
					filesList.add(pathname);
					return true;
				}
				return false;
			}
		};
		file.listFiles(fileFilter);

	}
}
