package DuAnCRM.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import UrlUtil.pathUtil;
import UrlUtil.urlUtil;

@WebServlet(urlPatterns = { urlUtil.URL_DASHBOARD, urlUtil.URL_ACCOUNT_EDIT, urlUtil.URL_LOGIN, urlUtil.URL_PROFILE,
		urlUtil.URL_BUTTONS, urlUtil.URL_SIGNUP, urlUtil.URL_ALERTS,urlUtil.URL_APP_TRELLO,urlUtil.URL_AVATAR,urlUtil.URL_CHARTS
		,urlUtil.URL_DATETIME,urlUtil.URL_DRAG,urlUtil.URL_FROMS,urlUtil.URL_FULL_CALENDAR,urlUtil.URL_ICONS,urlUtil.URL_LOADERS,urlUtil.URL_MODALS
		,urlUtil.URL_PAGINATION,urlUtil.URL_RANGE_SLIDERS,urlUtil.URL_TABLES,urlUtil.URL_TABS,urlUtil.URL_TEMPLATE,urlUtil.URL_VECTOR_MAP})

public class HomeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		// req.getRequestDispatcher("/decorators/components/login.jsp").forward(req,
		// resp);
		// req.getRequestDispatcher(pathUtil.PATH_DASHBOARD).forward(req, resp);
		String path = req.getServletPath();
		switch (path) {
		case urlUtil.URL_LOGIN:
			req.getRequestDispatcher(pathUtil.PATH_LOGIN).forward(req, resp);
			break;
		case urlUtil.URL_DASHBOARD:
			req.getRequestDispatcher(pathUtil.PATH_DASHBOARD).forward(req, resp);

			break;
		case urlUtil.URL_ACCOUNT_EDIT:
			req.getRequestDispatcher(pathUtil.PATH_ACCOUNT_EDIT).forward(req, resp);

			break;
		case urlUtil.URL_PROFILE:
			req.getRequestDispatcher(pathUtil.PATH_PROFILE).forward(req, resp);
			break;
		case urlUtil.URL_BUTTONS:
			req.getRequestDispatcher(pathUtil.PATH_BUTTONS).forward(req, resp);
			break;
		case urlUtil.URL_SIGNUP:
			req.getRequestDispatcher(pathUtil.PATH_SIGNUP).forward(req, resp);
			break;
		case urlUtil.URL_ALERTS:
			req.getRequestDispatcher(pathUtil.PATH_ALERTS).forward(req, resp);
			break;
		case urlUtil.URL_APP_TRELLO:
			req.getRequestDispatcher(pathUtil.PATH_APP_TRELLO).forward(req, resp);
			break;
			
		case urlUtil.URL_AVATAR:
			req.getRequestDispatcher(pathUtil.PATH_AVATAR).forward(req, resp);
			break;
		case urlUtil.URL_CHARTS:
			req.getRequestDispatcher(pathUtil.PATH_CHARTS).forward(req, resp);
			break;
		case urlUtil.URL_DATETIME:
			req.getRequestDispatcher(pathUtil.PATH_DATETIME).forward(req, resp);
			break;
		case urlUtil.URL_DRAG:
			req.getRequestDispatcher(pathUtil.PATH_DRAG).forward(req, resp);
			break;
		case urlUtil.URL_FROMS:
			req.getRequestDispatcher(pathUtil.PATH_FROMS).forward(req, resp);
			break;
		case urlUtil.URL_FULL_CALENDAR:
			req.getRequestDispatcher(pathUtil.PATH_FULL_CALENDAR).forward(req, resp);
			break;
		case urlUtil.URL_ICONS:
			req.getRequestDispatcher(pathUtil.PATH_ICONS).forward(req, resp);
			break;
		case urlUtil.URL_LOADERS:
			req.getRequestDispatcher(pathUtil.PATH_LOADERS).forward(req, resp);
			break;
		case urlUtil.URL_MODALS:
			req.getRequestDispatcher(pathUtil.PATH_MODALS).forward(req, resp);
			break;
		case urlUtil.URL_PAGINATION:
			req.getRequestDispatcher(pathUtil.PATH_PAGINATION).forward(req, resp);
			break;
		
		case urlUtil.URL_RANGE_SLIDERS:
			req.getRequestDispatcher(pathUtil.PATH_RANGE_SLIDERS).forward(req, resp);
			break;
		case urlUtil.URL_TABLES:
			req.getRequestDispatcher(pathUtil.PATH_TABLES).forward(req, resp);
			break;
		case urlUtil.URL_TABS:
			req.getRequestDispatcher(pathUtil.PATH_TABS).forward(req, resp);
			break;
		case urlUtil.URL_TEMPLATE:
			req.getRequestDispatcher(pathUtil.PATH_TEMPLATE).forward(req, resp);
			break;
		case urlUtil.URL_VECTOR_MAP:
			req.getRequestDispatcher(pathUtil.PATH_VECTOR_MAP).forward(req, resp);
			break;
		
		}
	}
}
