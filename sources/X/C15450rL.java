package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.0rL  reason: invalid class name and case insensitive filesystem */
public final class C15450rL {
    public static String A00(int i) {
        if (i == 1) {
            return "SUPERPACK_CREATE_SECONDAY_DEX_ARCHIVE";
        }
        if (i == 2) {
            return "SUPERPACK_NEXT_SECONDARY_DEX";
        }
        if (i == 3) {
            return "SUPERPACK_TOTAL_SECONDARY_DEX_UNPACKING";
        }
        if (i == 4) {
            return "SUPERPACK_TOTAL_SECONDARY_DEX_XZS_UNPACKING";
        }
        if (i == 3008) {
            return "SUPERPACK_FB_SO_LOADER_SUPERPACK_DECOMPRESSION_TOTAL";
        }
        if (i == 6493) {
            return "SUPERPACK_SUPERPACK_COMPRESSEDASSETSO_PREPARE";
        }
        if (i == 12229) {
            return "SUPERPACK_SUPERPACK_COMPACTSO_PREPARE";
        }
        switch (i) {
            case 7:
                return "SUPERPACK_SUPERPACK_CREATE_SECONDAY_DEX_ARCHIVE";
            case 8:
                return "SUPERPACK_SUPERPACK_NEXT_SECONDARY_DEX";
            case 9:
                return "SUPERPACK_SUPERPACK_TOTAL_SECONDARY_DEX_UNPACKING";
            case 10:
                return "SUPERPACK_SUPERPACK_TOTAL_SECONDARY_DEX_XZS_UNPACKING";
            case 11:
                return "SUPERPACK_FB_SO_LOADER_SUPERPACK_XZ_TOTAL";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "SUPERPACK_FB_SO_LOADER_SUPERPACK_ZSTD_TOTAL";
            case 13:
                return "SUPERPACK_FB_SO_LOADER_COMPRESSION_TOTAL";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
