package org.slf4j;

import X.AnonymousClass88D;
import X.AnonymousClass88E;

public final class LoggerFactory {
    public static int A00;
    public static AnonymousClass88D A01 = new AnonymousClass88D();
    public static AnonymousClass88E A02 = new AnonymousClass88E();
    public static final String[] A03 = {"1.6", "1.7"};

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0155, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C142608fI getLogger(java.lang.String r6) {
        /*
            int r0 = A00
            r4 = 1
            if (r0 != 0) goto L_0x015c
            A00 = r4
            java.util.LinkedHashSet r5 = X.C86134wK.A0u()     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            java.lang.Class<org.slf4j.LoggerFactory> r0 = org.slf4j.LoggerFactory.class
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch:{ IOException -> 0x002e }
            if (r1 != 0) goto L_0x0027
            java.lang.String r0 = "org/slf4j/impl/StaticLoggerBinder.class"
            java.util.Enumeration r1 = java.lang.ClassLoader.getSystemResources(r0)     // Catch:{ IOException -> 0x002e }
        L_0x0019:
            boolean r0 = r1.hasMoreElements()     // Catch:{ IOException -> 0x002e }
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r1.nextElement()     // Catch:{ IOException -> 0x002e }
            r5.add(r0)     // Catch:{ IOException -> 0x002e }
            goto L_0x0019
        L_0x0027:
            java.lang.String r0 = "org/slf4j/impl/StaticLoggerBinder.class"
            java.util.Enumeration r1 = r1.getResources(r0)     // Catch:{ IOException -> 0x002e }
            goto L_0x0019
        L_0x002e:
            r1 = move-exception
            java.lang.String r0 = "Error getting resources from path"
            X.C86134wK.A1T(r0, r1)     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
        L_0x0034:
            int r0 = r5.size()     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            if (r0 <= r4) goto L_0x0065
            java.lang.String r0 = "Class path contains multiple SLF4J bindings."
            X.AnonymousClass6WF.A00(r0)     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            java.util.Iterator r3 = r5.iterator()     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
        L_0x0043:
            boolean r0 = r3.hasNext()     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            if (r0 == 0) goto L_0x0060
            java.lang.Object r2 = r3.next()     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            java.lang.String r0 = "Found binding in ["
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            r1.append(r2)     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            java.lang.String r0 = "]"
            java.lang.String r0 = X.C18180wK.A0i(r0, r1)     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            X.AnonymousClass6WF.A00(r0)     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            goto L_0x0043
        L_0x0060:
            java.lang.String r0 = "See http://www.slf4j.org/codes.html#multiple_bindings for an explanation."
            X.AnonymousClass6WF.A00(r0)     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
        L_0x0065:
            org.slf4j.impl.StaticLoggerBinder.getSingleton()     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            r0 = 3
            A00 = r0     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            int r0 = r5.size()     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            if (r0 <= r4) goto L_0x0084
            java.lang.String r2 = "Actual binding is of type ["
            org.slf4j.impl.StaticLoggerBinder r0 = org.slf4j.impl.StaticLoggerBinder.getSingleton()     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            java.lang.String r1 = r0.getLoggerFactoryClassStr()     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            java.lang.String r0 = "]"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r1, r0)     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            X.AnonymousClass6WF.A00(r0)     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
        L_0x0084:
            X.88E r0 = A02     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            java.util.List r1 = r0.A00     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            monitor-enter(r1)     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            r2.addAll(r1)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b7 }
            int r0 = r2.size()     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = "The following loggers will not work because they were created"
            X.AnonymousClass6WF.A00(r0)     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            java.lang.String r0 = "during the default configuration phase of the underlying logging system."
            X.AnonymousClass6WF.A00(r0)     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            java.lang.String r0 = "See also http://www.slf4j.org/codes.html#substituteLogger"
            X.AnonymousClass6WF.A00(r0)     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            r1 = 0
        L_0x00a7:
            int r0 = r2.size()     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            if (r1 >= r0) goto L_0x0118
            java.lang.String r0 = X.C18190wL.A0p(r2, r1)     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            X.AnonymousClass6WF.A00(r0)     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
            int r1 = r1 + 1
            goto L_0x00a7
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b7 }
            throw r0     // Catch:{ NoClassDefFoundError -> 0x00ee, NoSuchMethodError -> 0x00cb, Exception -> 0x00ba }
        L_0x00ba:
            r2 = move-exception
            r0 = 2
            A00 = r0
            java.lang.String r0 = "Failed to instantiate SLF4J LoggerFactory"
            X.C86134wK.A1T(r0, r2)
            java.lang.String r1 = "Unexpected initialization failure"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x00cb:
            r3 = move-exception
            java.lang.String r1 = r3.getMessage()
            if (r1 == 0) goto L_0x0155
            java.lang.String r0 = "org.slf4j.impl.StaticLoggerBinder.getSingleton()"
            int r1 = r1.indexOf(r0)
            r0 = -1
            if (r1 == r0) goto L_0x0155
            r0 = 2
            A00 = r0
            java.lang.String r0 = "slf4j-api 1.6.x (or later) is incompatible with this binding."
            X.AnonymousClass6WF.A00(r0)
            java.lang.String r0 = "Your binding is version 1.5.5 or earlier."
            X.AnonymousClass6WF.A00(r0)
            java.lang.String r0 = "Upgrade your binding to version 1.6.x."
            X.AnonymousClass6WF.A00(r0)
            throw r3
        L_0x00ee:
            r3 = move-exception
            java.lang.String r2 = r3.getMessage()
            if (r2 == 0) goto L_0x014d
            java.lang.String r0 = "org/slf4j/impl/StaticLoggerBinder"
            int r0 = r2.indexOf(r0)
            r1 = -1
            if (r0 != r1) goto L_0x0106
            java.lang.String r0 = "org.slf4j.impl.StaticLoggerBinder"
            int r0 = r2.indexOf(r0)
            if (r0 == r1) goto L_0x014d
        L_0x0106:
            r0 = 4
            A00 = r0
            java.lang.String r0 = "Failed to load class \"org.slf4j.impl.StaticLoggerBinder\"."
            X.AnonymousClass6WF.A00(r0)
            java.lang.String r0 = "Defaulting to no-operation (NOP) logger implementation"
            X.AnonymousClass6WF.A00(r0)
            java.lang.String r0 = "See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details."
            X.AnonymousClass6WF.A00(r0)
        L_0x0118:
            int r1 = A00
            r0 = 3
            if (r1 != r0) goto L_0x015c
            java.lang.String r5 = org.slf4j.impl.StaticLoggerBinder.REQUESTED_API_VERSION     // Catch:{ NoSuchFieldError -> 0x015c, all -> 0x0156 }
            r2 = 0
            r1 = 0
        L_0x0121:
            java.lang.String[] r3 = A03     // Catch:{ NoSuchFieldError -> 0x015c, all -> 0x0156 }
            int r0 = r3.length     // Catch:{ NoSuchFieldError -> 0x015c, all -> 0x0156 }
            if (r2 >= r0) goto L_0x0132
            r0 = r3[r2]     // Catch:{ NoSuchFieldError -> 0x015c, all -> 0x0156 }
            boolean r0 = r5.startsWith(r0)     // Catch:{ NoSuchFieldError -> 0x015c, all -> 0x0156 }
            if (r0 == 0) goto L_0x012f
            r1 = 1
        L_0x012f:
            int r2 = r2 + 1
            goto L_0x0121
        L_0x0132:
            if (r1 != 0) goto L_0x015c
            java.lang.String r2 = "The requested version "
            java.lang.String r1 = " by your slf4j binding is not compatible with "
            java.util.List r0 = java.util.Arrays.asList(r3)     // Catch:{ NoSuchFieldError -> 0x015c, all -> 0x0156 }
            java.lang.String r0 = r0.toString()     // Catch:{ NoSuchFieldError -> 0x015c, all -> 0x0156 }
            java.lang.String r0 = X.AnonymousClass00U.A0d(r2, r5, r1, r0)     // Catch:{ NoSuchFieldError -> 0x015c, all -> 0x0156 }
            X.AnonymousClass6WF.A00(r0)     // Catch:{ NoSuchFieldError -> 0x015c, all -> 0x0156 }
            java.lang.String r0 = "See http://www.slf4j.org/codes.html#version_mismatch for further details."
            X.AnonymousClass6WF.A00(r0)     // Catch:{ NoSuchFieldError -> 0x015c, all -> 0x0156 }
            goto L_0x015c
        L_0x014d:
            r0 = 2
            A00 = r0
            java.lang.String r0 = "Failed to instantiate SLF4J LoggerFactory"
            X.C86134wK.A1T(r0, r3)
        L_0x0155:
            throw r3
        L_0x0156:
            r1 = move-exception
            java.lang.String r0 = "Unexpected problem occured during version sanity check"
            X.C86134wK.A1T(r0, r1)
        L_0x015c:
            int r1 = A00
            if (r1 == r4) goto L_0x0179
            r0 = 2
            if (r1 == r0) goto L_0x0183
            r0 = 3
            if (r1 == r0) goto L_0x0170
            r0 = 4
            if (r1 != r0) goto L_0x017c
            X.88D r0 = A01
        L_0x016b:
            X.8fI r0 = r0.Ass(r6)
            return r0
        L_0x0170:
            org.slf4j.impl.StaticLoggerBinder r0 = org.slf4j.impl.StaticLoggerBinder.getSingleton()
            X.8ji r0 = r0.getLoggerFactory()
            goto L_0x016b
        L_0x0179:
            X.88E r0 = A02
            goto L_0x016b
        L_0x017c:
            java.lang.String r0 = "Unreachable code"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0183:
            java.lang.String r0 = "org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.slf4j.LoggerFactory.getLogger(java.lang.String):X.8fI");
    }
}
