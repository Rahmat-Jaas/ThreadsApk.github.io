package ch.boye.httpclientandroidlib.util;

import X.AnonymousClass00U;
import X.C18190wL;
import X.C18220wO;
import X.C18240wQ;
import X.C86154wM;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

public class VersionInfo {
    public static final String PROPERTY_MODULE = "info.module";
    public static final String PROPERTY_RELEASE = "info.release";
    public static final String PROPERTY_TIMESTAMP = "info.timestamp";
    public static final String UNAVAILABLE = "UNAVAILABLE";
    public static final String VERSION_PROPERTY_FILE = "version.properties";
    public final String infoClassloader;
    public final String infoModule;
    public final String infoPackage;
    public final String infoRelease;
    public final String infoTimestamp;

    public static final VersionInfo fromMap(String str, Map map, ClassLoader classLoader) {
        String str2;
        String str3;
        String str4;
        String str5 = str;
        if (str != null) {
            String str6 = null;
            if (map != null) {
                str2 = C18220wO.A0r(PROPERTY_MODULE, map);
                if (str2 != null && str2.length() < 1) {
                    str2 = null;
                }
                str3 = C18220wO.A0r(PROPERTY_RELEASE, map);
                if (str3 != null && (str3.length() < 1 || str3.equals("${pom.version}"))) {
                    str3 = null;
                }
                str4 = C18220wO.A0r(PROPERTY_TIMESTAMP, map);
                if (str4 != null && (str4.length() < 1 || str4.equals("${mvn.timestamp}"))) {
                    str4 = null;
                }
            } else {
                str2 = null;
                str3 = null;
                str4 = null;
            }
            if (classLoader != null) {
                str6 = classLoader.toString();
            }
            return new VersionInfo(str5, str2, str3, str4, str6);
        }
        throw C18190wL.A0a("Package identifier must not be null.");
    }

    public static final VersionInfo loadVersionInfo(String str, ClassLoader classLoader) {
        InputStream resourceAsStream;
        if (str != null) {
            if (classLoader == null) {
                classLoader = Thread.currentThread().getContextClassLoader();
            }
            try {
                resourceAsStream = classLoader.getResourceAsStream(AnonymousClass00U.A0V(str.replace('.', '/'), "/", VERSION_PROPERTY_FILE));
                if (resourceAsStream == null) {
                    return null;
                }
                Properties properties = new Properties();
                properties.load(resourceAsStream);
                try {
                    resourceAsStream.close();
                } catch (IOException unused) {
                }
                return fromMap(str, properties, classLoader);
            } catch (IOException unused2) {
                return null;
            } catch (Throwable th) {
                resourceAsStream.close();
                throw th;
            }
        } else {
            throw C18190wL.A0a("Package identifier must not be null.");
        }
    }

    public final String getClassloader() {
        return this.infoClassloader;
    }

    public final String getModule() {
        return this.infoModule;
    }

    public final String getPackage() {
        return this.infoPackage;
    }

    public final String getRelease() {
        return this.infoRelease;
    }

    public final String getTimestamp() {
        return this.infoTimestamp;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(C86154wM.A06(this.infoClassloader, C86154wM.A06(this.infoTimestamp, C86154wM.A06(this.infoRelease, C86154wM.A06(this.infoModule, this.infoPackage.length() + 20)))));
        stringBuffer.append("VersionInfo(");
        stringBuffer.append(this.infoPackage);
        stringBuffer.append(':');
        stringBuffer.append(this.infoModule);
        if (!UNAVAILABLE.equals(this.infoRelease)) {
            stringBuffer.append(':');
            stringBuffer.append(this.infoRelease);
        }
        if (!UNAVAILABLE.equals(this.infoTimestamp)) {
            stringBuffer.append(':');
            stringBuffer.append(this.infoTimestamp);
        }
        stringBuffer.append(')');
        if (!UNAVAILABLE.equals(this.infoClassloader)) {
            stringBuffer.append('@');
            stringBuffer.append(this.infoClassloader);
        }
        return stringBuffer.toString();
    }

    public VersionInfo(String str, String str2, String str3, String str4, String str5) {
        if (str != null) {
            this.infoPackage = str;
            this.infoModule = str2 == null ? UNAVAILABLE : str2;
            this.infoRelease = str3 == null ? UNAVAILABLE : str3;
            this.infoTimestamp = str4 == null ? UNAVAILABLE : str4;
            this.infoClassloader = str5 == null ? UNAVAILABLE : str5;
            return;
        }
        throw C18190wL.A0a("Package identifier must not be null.");
    }

    public static final VersionInfo[] loadVersionInfo(String[] strArr, ClassLoader classLoader) {
        if (strArr != null) {
            ArrayList A0k = C18240wQ.A0k(r3);
            for (String loadVersionInfo : strArr) {
                VersionInfo loadVersionInfo2 = loadVersionInfo(loadVersionInfo, classLoader);
                if (loadVersionInfo2 != null) {
                    A0k.add(loadVersionInfo2);
                }
            }
            return (VersionInfo[]) A0k.toArray(new VersionInfo[A0k.size()]);
        }
        throw C18190wL.A0a("Package identifier list must not be null.");
    }
}
