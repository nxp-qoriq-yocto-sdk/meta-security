SUMMARY = "interface to seccomp filtering mechanism"
DESCRIPTION = "The libseccomp library provides and easy to use, platform independent,interface to the Linux Kernel's syscall filtering mechanism: seccomp."
SECTION = "security"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;beginline=0;endline=1;md5=8eac08d22113880357ceb8e7c37f989f"

SRCREV = "0843a460f72da50756432a021c387fe8a7ab0bd5"

PV = "2.2.0+git${SRCPV}"

SRC_URI = "git://github.com/seccomp/libseccomp.git;protocol=http;branch=working-ppc64"

S = "${WORKDIR}/git"

inherit autotools-brokensep pkgconfig

PACKAGECONFIG ??= ""
PACKAGECONFIG[python] = "--enable-python, --disable-python, python"

# PowerPC is not supported in this version.
COMPATIBLE_HOST = '(x86_64|i.86|arm|arm64|mips|mips64|powerpc).*-linux'

RDEPENDS_${PN} = "bash"
