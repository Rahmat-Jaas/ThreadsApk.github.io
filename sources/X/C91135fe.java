package X;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: X.5fe  reason: invalid class name and case insensitive filesystem */
public final class C91135fe extends C30884GaO {
    public final Context A00;
    public final ITF A01;

    public final ByteBuffer A01() {
        C13780oI.A01("XzFrscLanguagePackLoaderImpl.getEnglishStringsBuffer", 571117974);
        try {
            File AOC = this.A01.AOC((C109746kY) null, 573671032);
            File A0U = C86154wM.A0U(AOC, "uncompressed_default.frsc.xz");
            ArrayList A0v = AnonymousClass0wJ.A0v();
            Executor executor = AnonymousClass0FK.A07;
            Context context = this.A00;
            A0v.add(new C03140Em("strings/default.frsc.checksum", "uncompressed_default.frsc.checksum"));
            A0v.add(new AnonymousClass0QN(C28174Ezk.A00(788), "uncompressed_default.frsc.xz"));
            AnonymousClass0SJ.A00(AOC);
            for (int i = 0; i < A0v.size(); i = C86124wJ.A0D(AOC, A0v, i)) {
            }
            new AnonymousClass0FK(context, AOC, "DefaultFrscUnpacker", A0v, executor).A03();
            MappedByteBuffer map = new RandomAccessFile(A0U, "r").getChannel().map(FileChannel.MapMode.READ_ONLY, 0, A0U.length());
            C13780oI.A00(-321057575);
            return map;
        } catch (IOException e) {
            throw C86154wM.A0h(AnonymousClass00U.A08(new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes(), "Error loading default.frsc.xz. Free disk space = "), e);
        } catch (Throwable th) {
            C13780oI.A00(-143185620);
            throw th;
        }
    }

    public C91135fe(Context context, C30999Gd7 gd7, ITF itf, Locale locale) {
        super(context, gd7, locale);
        this.A00 = context;
        this.A01 = itf;
    }
}
