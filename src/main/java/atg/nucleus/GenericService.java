package atg.nucleus;

import atg.naming.*;
import atg.nucleus.logging.ApplicationLoggingSender;
import atg.nucleus.logging.VariableArgumentApplicationLoggingImpl;

import javax.servlet.Servlet;

public class GenericService
    extends VariableArgumentApplicationLoggingImpl
    implements NameContextBindingListener,
        ComponentNameResolver,
        NameContextElement,
        ServiceListener,
        Service,
        ApplicationLoggingSender,
        AdminableService,
        NameContextParentable,
        AbsoluteNameable,
        Configured {

    /**
     * @return the admin servlet that draws and does admin in dyn admin for this service usually a {@link ServiceAdminServlet}
     */
    public Servlet getAdminServlet(){
        return null;
    }

    /**
     * @return the newly created admin servlet that draws and does admin in dyn admin for this service usually a {@link ServiceAdminServlet}
     */
    protected Servlet createAdminServlet(){
        return null;
    }


    private Nucleus nucleus;

    public Nucleus getNucleus(){
        return nucleus;
    }

    public void setNucleus(Nucleus nucleus){
        this.nucleus = nucleus;
    }

}
