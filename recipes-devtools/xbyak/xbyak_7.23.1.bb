SUMMARY = "JIT assembler for x86(IA-32)/x64(AMD64/x86-64)"
HOMEPAGE = "https://github.com/herumi/xbyak"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=3c98edfaa50a86eeaef4c6109e803f16"

SRC_URI = "git://github.com/herumi/xbyak.git;protocol=https;branch=master \
           file://0001-cmake-fix-install-interface-include-directory.patch \
           "
SRCREV = "0d67fd1530016b7c56f3cd74b3fca920f4c3e2b4"

inherit cmake

# Header-only library
ALLOW_EMPTY:${PN} = "1"

BBCLASSEXTEND = "native nativesdk"
