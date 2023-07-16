package X;

import dalvik.system.PathClassLoader;

/* renamed from: X.65w  reason: invalid class name */
public final class AnonymousClass65w extends PathClassLoader {
    public final Class loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }

    public AnonymousClass65w(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }
}
