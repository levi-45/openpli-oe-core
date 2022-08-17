DESCRIPTION = "Infobar Weather plugin"
MAINTAINER = "scriptmelvin"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/LICENSE;md5=eb723b61539feef013de476e68b5c50a"

inherit gitpkgv distutils-openplugins gettext

PV = "2.0+git${SRCPV}"
PKGV = "2.0+git${GITPKGV}"

SRC_URI = "git://github.com/scriptmelvin/enigma2-plugin-extensions-infobarweather.git;protocol=https;branch=main"

S="${WORKDIR}/git"

do_install_append() {
	install -d ${D}/usr/lib/enigma2/python/Plugins/Extensions/InfoBarWeather/locale
	cp -rf ${S}/build/lib/Extensions/InfoBarWeather/locale/ ${D}/${libdir}/enigma2/python/Plugins/Extensions/InfoBarWeather/
}

include ${PYTHON_PN}-package-split-plugins.inc
