package X;

import com.google.common.collect.ImmutableMap;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.Set;

/* renamed from: X.8G1  reason: invalid class name */
public final class AnonymousClass8G1 extends C02220Ah implements AnonymousClass0ZU {
    public static final AnonymousClass8G1 A00 = new AnonymousClass8G1();

    public AnonymousClass8G1() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        C04530Oa r4 = AnonymousClass7DD.A07;
        builder.put(FXPFAccessLibraryDebugFragment.NAME, new C134697yC(C86114wI.A0v(builder, "family-name", new C134697yC(C86114wI.A0v(builder, "given-name", new C134697yC(C86114wI.A0v(builder, "address-level1", new C134697yC(C86114wI.A0v(builder, "address-level2", new C134697yC(C86114wI.A0v(builder, "postal-code", new C134697yC(C86114wI.A0v(builder, "country", new C134697yC(C86114wI.A0v(builder, "address-line1", new C134697yC(C86114wI.A0v(builder, "address-line2", new C134697yC(C86114wI.A0v(builder, "address-line3", new C134697yC(C86114wI.A0v(builder, "tel", new C134697yC(C86114wI.A0v(builder, "email", new C134697yC((Set) r4.getValue(), "eE][- ]?mail|[uU]ser[\\-_\\s]?[nN]ame"), r4), "[pP]hone|[\b_][tT]el|[tT]el(f|eph)"), r4), "address.*line[^\\[]?3|address[^\\[]?3|addr[^\\[]?3|line[^\\[]?3|address.*three"), r4), "address.*line[^\\[]?2|address[^\\[]?2|addr[^\\[]?2|[sS]uite|[aA]partment|address.*two"), r4), "address.*line|address[^\\[]?1|addr[^\\[]?1|[sS]treet|address.*one"), r4), "[cC]ountry"), r4), "[zZ][iI][pP]|[pP]ostal|[pP]ost.*[cC]ode"), r4), "[cC]ity|[tT]own|[cC]idade"), r4), "[rR]egion|[pP]rovince|[sS]tate|[eE]stado"), r4), "[gG]iven.?[nN]ame|[fF]irst.?[nN]ame|\\bfname"), r4), "[fF]amily.?[nN]ame|^[lL]ast.?[nN]ame|\\blname|[sS]urname|^[aA]pellido[s]$\""), r4), "[fF]ull.?[nN]ame|[fF]irst.*[lL]ast.*[nN]ame|\\b[nN]ame|\\b[nN]ome|^[nN]ombre[s]$|[aA]pellidos y [nN]ombres|[nN]ombres y [aA]pellidos"));
        return builder.build();
    }
}
