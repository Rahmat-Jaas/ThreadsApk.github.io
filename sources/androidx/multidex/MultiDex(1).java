package androidx.multidex;

import X.AnonymousClass00U;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public final class MultiDex {
    public static final Set A00 = new HashSet();
    public static final boolean A01;

    static {
        String str;
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String str2 = null;
            if (stringTokenizer.hasMoreTokens()) {
                str = stringTokenizer.nextToken();
            } else {
                str = null;
            }
            if (stringTokenizer.hasMoreTokens()) {
                str2 = stringTokenizer.nextToken();
            }
            if (!(str == null || str2 == null)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    int parseInt2 = Integer.parseInt(str2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        A01 = z;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ef */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x0129 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Context r13) {
        /*
            java.lang.String r2 = "MultiDex"
            boolean r0 = A01
            if (r0 != 0) goto L_0x015a
            android.content.pm.ApplicationInfo r1 = r13.getApplicationInfo()     // Catch:{ RuntimeException -> 0x013b }
            if (r1 == 0) goto L_0x015a
            java.lang.String r0 = r1.sourceDir     // Catch:{ Exception -> 0x0142 }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x0142 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0142 }
            java.lang.String r0 = r1.dataDir     // Catch:{ Exception -> 0x0142 }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0142 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0142 }
            java.lang.String r8 = "secondary-dexes"
            java.util.Set r4 = A00     // Catch:{ Exception -> 0x0142 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x0142 }
            boolean r0 = r4.contains(r7)     // Catch:{ all -> 0x0138 }
            if (r0 != 0) goto L_0x0136
            r4.add(r7)     // Catch:{ all -> 0x0138 }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0138 }
            r3 = 20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r1.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "MultiDex is not guaranteed to work in SDK version "
            r1.append(r0)     // Catch:{ all -> 0x0138 }
            r1.append(r6)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = ": SDK version higher than "
            r1.append(r0)     // Catch:{ all -> 0x0138 }
            r1.append(r3)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = " should be backed by "
            r1.append(r0)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "runtime with built-in multidex capabilty but it's not the "
            r1.append(r0)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "case here: java.vm.version=\""
            r1.append(r0)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "java.vm.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x0138 }
            r1.append(r0)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "\""
            r1.append(r0)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0138 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0138 }
            java.lang.ClassLoader r6 = r13.getClassLoader()     // Catch:{ RuntimeException -> 0x012a }
            boolean r0 = r6 instanceof dalvik.system.BaseDexClassLoader     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x0131
            if (r6 == 0) goto L_0x0136
            java.io.File r0 = r13.getFilesDir()     // Catch:{ all -> 0x00de }
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x00de }
            r10.<init>(r0, r8)     // Catch:{ all -> 0x00de }
            boolean r0 = r10.isDirectory()     // Catch:{ all -> 0x00de }
            if (r0 == 0) goto L_0x00e4
            r10.getPath()     // Catch:{ all -> 0x00de }
            java.lang.String r3 = ")."
            java.io.File[] r12 = r10.listFiles()     // Catch:{ all -> 0x00de }
            if (r12 != 0) goto L_0x00a2
            java.lang.String r0 = "Failed to list secondary dex dir content ("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00de }
            r1.<init>(r0)     // Catch:{ all -> 0x00de }
            java.lang.String r0 = r10.getPath()     // Catch:{ all -> 0x00de }
            r1.append(r0)     // Catch:{ all -> 0x00de }
        L_0x0097:
            r1.append(r3)     // Catch:{ all -> 0x00de }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00de }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x00de }
            goto L_0x00e4
        L_0x00a2:
            int r11 = r12.length     // Catch:{ all -> 0x00de }
            r9 = 0
        L_0x00a4:
            if (r9 >= r11) goto L_0x00c8
            r3 = r12[r9]     // Catch:{ all -> 0x00de }
            r3.getPath()     // Catch:{ all -> 0x00de }
            r3.length()     // Catch:{ all -> 0x00de }
            boolean r0 = r3.delete()     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x00c2
            java.lang.String r1 = "Failed to delete old file "
            java.lang.String r0 = r3.getPath()     // Catch:{ all -> 0x00de }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ all -> 0x00de }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x00de }
            goto L_0x00c5
        L_0x00c2:
            r3.getPath()     // Catch:{ all -> 0x00de }
        L_0x00c5:
            int r9 = r9 + 1
            goto L_0x00a4
        L_0x00c8:
            boolean r0 = r10.delete()     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x00da
            java.lang.String r0 = "Failed to delete secondary dex dir "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00de }
            r1.<init>(r0)     // Catch:{ all -> 0x00de }
            java.lang.String r3 = r10.getPath()     // Catch:{ all -> 0x00de }
            goto L_0x0097
        L_0x00da:
            r10.getPath()     // Catch:{ all -> 0x00de }
            goto L_0x00e4
        L_0x00de:
            r1 = move-exception
            java.lang.String r0 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r2, r0, r1)     // Catch:{ all -> 0x0138 }
        L_0x00e4:
            java.lang.String r3 = "code_cache"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0138 }
            r1.<init>(r5, r3)     // Catch:{ all -> 0x0138 }
            A02(r1)     // Catch:{ IOException -> 0x00ef }
            goto L_0x00fb
        L_0x00ef:
            java.io.File r0 = r13.getFilesDir()     // Catch:{ all -> 0x0138 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0138 }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x0138 }
            A02(r1)     // Catch:{ all -> 0x0138 }
        L_0x00fb:
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0138 }
            r5.<init>(r1, r8)     // Catch:{ all -> 0x0138 }
            A02(r5)     // Catch:{ all -> 0x0138 }
            X.06X r3 = new X.06X     // Catch:{ all -> 0x0138 }
            r3.<init>(r7, r5)     // Catch:{ all -> 0x0138 }
            r0 = 0
            java.util.List r0 = r3.A04(r13, r0)     // Catch:{ all -> 0x0125 }
            A03(r5, r6, r0)     // Catch:{ IOException -> 0x0111 }
            goto L_0x011f
        L_0x0111:
            r1 = move-exception
            java.lang.String r0 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            android.util.Log.w(r2, r0, r1)     // Catch:{ all -> 0x0125 }
            r0 = 1
            java.util.List r0 = r3.A04(r13, r0)     // Catch:{ all -> 0x0125 }
            A03(r5, r6, r0)     // Catch:{ all -> 0x0125 }
        L_0x011f:
            r3.close()     // Catch:{ IOException -> 0x0123 }
            goto L_0x0136
        L_0x0123:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0138 }
        L_0x0125:
            r0 = move-exception
            r3.close()     // Catch:{ IOException -> 0x0129 }
        L_0x0129:
            throw r0     // Catch:{ all -> 0x0138 }
        L_0x012a:
            r1 = move-exception
            java.lang.String r0 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
            android.util.Log.w(r2, r0, r1)     // Catch:{ all -> 0x0138 }
            goto L_0x0136
        L_0x0131:
            java.lang.String r0 = "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching."
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x0138 }
        L_0x0136:
            monitor-exit(r4)     // Catch:{ all -> 0x0138 }
            return
        L_0x0138:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0138 }
            throw r0     // Catch:{ Exception -> 0x0142 }
        L_0x013b:
            r1 = move-exception
            java.lang.String r0 = "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching."
            android.util.Log.w(r2, r0, r1)     // Catch:{ Exception -> 0x0142 }
            return
        L_0x0142:
            r1 = move-exception
            java.lang.String r0 = "MultiDex installation failure"
            android.util.Log.e(r2, r0, r1)
            java.lang.String r2 = "MultiDex installation failed ("
            java.lang.String r1 = r1.getMessage()
            java.lang.String r0 = ")."
            java.lang.String r1 = X.AnonymousClass00U.A0V(r2, r1, r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.MultiDex.A01(android.content.Context):void");
    }

    public static Field A00(Object obj, String str) {
        Class cls = obj.getClass();
        Class cls2 = cls;
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (declaredField.isAccessible()) {
                    return declaredField;
                }
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder sb = new StringBuilder("Field ");
        sb.append(str);
        sb.append(" not found in ");
        sb.append(cls2);
        throw new NoSuchFieldException(sb.toString());
    }

    public static void A02(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to create dir ");
            String path = file.getPath();
            if (parentFile == null) {
                sb.append(path);
                sb.append(". Parent file is null.");
            } else {
                sb.append(path);
                sb.append(". parent file is a dir ");
                sb.append(parentFile.isDirectory());
                sb.append(", a file ");
                sb.append(parentFile.isFile());
                sb.append(", exists ");
                sb.append(parentFile.exists());
                sb.append(", readable ");
                sb.append(parentFile.canRead());
                sb.append(", writable ");
                sb.append(parentFile.canWrite());
            }
            Log.e("MultiDex", sb.toString());
            throw new IOException(AnonymousClass00U.A0L("Failed to create directory ", file.getPath()));
        }
    }

    public static void A03(File file, ClassLoader classLoader, List list) {
        Object[] objArr;
        if (!list.isEmpty()) {
            Object obj = A00(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(list);
            Class<ArrayList> cls = ArrayList.class;
            Class[] clsArr = {cls, File.class, cls};
            Class cls2 = obj.getClass();
            Class cls3 = cls2;
            while (cls2 != null) {
                try {
                    Method declaredMethod = cls2.getDeclaredMethod("makeDexElements", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    Object[] objArr2 = (Object[]) declaredMethod.invoke(obj, new Object[]{arrayList2, file, arrayList});
                    Field A002 = A00(obj, "dexElements");
                    Object[] objArr3 = (Object[]) A002.get(obj);
                    Class<?> componentType = objArr3.getClass().getComponentType();
                    int length = objArr3.length;
                    int length2 = objArr2.length;
                    Object newInstance = Array.newInstance(componentType, length + length2);
                    System.arraycopy(objArr3, 0, newInstance, 0, length);
                    System.arraycopy(objArr2, 0, newInstance, length, length2);
                    A002.set(obj, newInstance);
                    if (arrayList.size() > 0) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Log.w("MultiDex", "Exception in makeDexElement", (Throwable) it.next());
                        }
                        Field A003 = A00(obj, "dexElementsSuppressedExceptions");
                        IOException[] iOExceptionArr = (IOException[]) A003.get(obj);
                        int size = arrayList.size();
                        if (iOExceptionArr == null) {
                            objArr = arrayList.toArray(new IOException[size]);
                        } else {
                            int length3 = iOExceptionArr.length;
                            objArr = new IOException[(size + length3)];
                            arrayList.toArray(objArr);
                            System.arraycopy(iOExceptionArr, 0, objArr, arrayList.size(), length3);
                        }
                        A003.set(obj, objArr);
                        IOException iOException = new IOException("I/O exception during makeDexElement");
                        iOException.initCause((Throwable) arrayList.get(0));
                        throw iOException;
                    }
                    return;
                } catch (NoSuchMethodException unused) {
                    cls2 = cls2.getSuperclass();
                }
            }
            StringBuilder sb = new StringBuilder("Method ");
            sb.append("makeDexElements");
            sb.append(" with parameters ");
            sb.append(Arrays.asList(clsArr));
            sb.append(" not found in ");
            sb.append(cls3);
            throw new NoSuchMethodException(sb.toString());
        }
    }
}
