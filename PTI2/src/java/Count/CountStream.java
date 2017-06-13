/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Count;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Yoseph
 */
public class CountStream implements HttpSessionListener {

    private int totalSessionCount = 0;
    private int currentSessionCount = 0;
    private int maxSessionCount = 0;
    private ServletContext context = null;

    public void sessionCreated(HttpSessionEvent event) {
        totalSessionCount++;
        currentSessionCount++;
//        JOptionPane.showMessageDialog(null, "life "+currentSessionCount);
        if (currentSessionCount > maxSessionCount) {
            maxSessionCount = currentSessionCount;
        }
        if (context == null) {
            storeInServletContext(event);
        }
    }

    public void sessionDestroyed(HttpSessionEvent event) {
//        JOptionPane.showMessageDialog(null, "die "+currentSessionCount);
        currentSessionCount--;
    }

    /**
     * The total number of sessions created.
     */
    public int getTotalSessionCount() {
        return (totalSessionCount);
    }

    /**
     * The number of sessions currently in memory.
     */
    public int getCurrentSessionCount() {
        return (currentSessionCount);
    }

    /**
     * The largest number of sessions ever in memory at any one time.
     */

    public int getMaxSessionCount() {
        return (maxSessionCount);
    }

    // Register self in the servlet context so that
    // servlets and JSP pages can access the session counts.
    private void storeInServletContext(HttpSessionEvent event) {
        HttpSession session = event.getSession();
//        JOptionPane.showMessageDialog(null, session.getMaxInactiveInterval());
//        session.setMaxInactiveInterval(60);
        context = session.getServletContext();
//        session.setMaxInactiveInterval(60);
        context.setAttribute("sessionCounter", this);
    }

}
