package X;

import java.io.File;
import org.json.JSONObject;

/* renamed from: X.7dD  reason: invalid class name and case insensitive filesystem */
public final class C125467dD implements C39729Kyr {
    public final int A00;
    public final long A01;
    public final long A02;
    public final File A03;

    public final boolean BTX(Object obj) {
        File file;
        C125467dD r7 = (C125467dD) obj;
        File file2 = this.A03;
        if (file2 == null || (file = r7.A03) == null || !file2.getAbsolutePath().equals(file.getAbsolutePath()) || this.A00 != r7.A00 || this.A02 != r7.A02 || this.A01 != r7.A01) {
            return false;
        }
        return true;
    }

    public final int CuF() {
        return "att".getBytes().length + "len".getBytes().length + "lmt".getBytes().length + 4 + 16;
    }

    public final /* bridge */ /* synthetic */ JSONObject CxI(Object obj, JSONObject jSONObject) {
        JSONObject A0y = C18230wP.A0y();
        A0y.put("att", this.A00);
        A0y.put("len", this.A02);
        A0y.put("lmt", this.A01);
        jSONObject.put((String) obj, A0y);
        return jSONObject;
    }

    public C125467dD(File file) {
        long j;
        boolean z;
        this.A03 = file;
        long j2 = 0;
        if (file != null) {
            j = file.lastModified();
        } else {
            j = 0;
        }
        this.A01 = j;
        this.A02 = file != null ? file.length() : j2;
        if (file == null || !file.exists()) {
            z = false;
        } else {
            z = file.isFile();
            z = file.isDirectory() ? z | true : z;
            z = file.isAbsolute() ? z | true : z;
            if (file.isHidden()) {
                z |= true;
            }
        }
        this.A00 = z ? 1 : 0;
    }
}
