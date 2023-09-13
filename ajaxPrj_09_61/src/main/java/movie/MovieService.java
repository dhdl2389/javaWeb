package movie;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class MovieService {

	MovieDAO dao = new MovieDAO();

	public JSONArray getMovieList() {

		ArrayList<Movie> list = new ArrayList<>();

		list.add(new Movie("주유소 습격사건", "9800", "C"));
		list.add(new Movie("권순분여사 납치사건", "12000", "B"));
		list.add(new Movie("하얀마음 백구", "18000", "A"));

		JSONArray arr = new JSONArray();

		for (Movie m : list) {

			JSONObject o = new JSONObject();
			o.put("name", m.getName());
			o.put("price", m.getPrice());
			o.put("grade", m.getGrade());

			arr.put(o);
		}

		return arr;
	}

	public JSONArray getMovieRealList() {

		ArrayList<Movie> list = dao.selectAll();
		JSONArray arr = new JSONArray();

		for (Movie m : list) {

			JSONObject o = new JSONObject();
			o.put("name", m.getName());
			o.put("price", m.getPrice());
			o.put("grade", m.getGrade());

			arr.put(o);
		}

		return arr;
	}

}
