# Override do_compile for PMR: skip cli (depends on qat_lib/KLM headers)
do_compile:intel-axxia-pmr () {
	cd ${S}
	oe_runmake ${IES_EXTRA_FLAGS} ies_api_install
	oe_runmake install
}
