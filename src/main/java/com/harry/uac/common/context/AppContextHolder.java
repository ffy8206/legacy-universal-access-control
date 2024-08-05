package com.harry.uac.common.context;

/**
 * A static class for holding the global context data
 * 
 * @author xm
 * 
 */
public class AppContextHolder {
    private static final InheritableThreadLocal<AppContext> holder = new InheritableThreadLocal<AppContext>() {
	@Override
	protected AppContext initialValue() {
	    return null;
	}
    };

    public static AppContext getContext() {
	return holder.get();
    }

    public static void setContext(AppContext context) {
	holder.set(context);
    }

    public static void clear() {
	holder.remove();
    }
}
