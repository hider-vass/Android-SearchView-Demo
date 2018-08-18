package danbroid.searchviewdemo.demo4

import android.os.Bundle
import android.view.MenuItem
import danbroid.searchviewdemo.BaseActivity
import danbroid.searchviewdemo.R


private val log by lazy {
  org.slf4j.LoggerFactory.getLogger(Demo4Activity::class.java)
}

class Demo4Activity : BaseActivity() {

  override fun configureSearchMenu(menuItem: MenuItem) {
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean =
      when (item.itemId) {
        R.id.action_search -> {
          onSearchRequested()
          true
        }
        else -> super.onOptionsItemSelected(item)
      }


  override fun onSearchRequested(): Boolean {
    log.trace("onSearchRequested()")
    return super.onSearchRequested()
  }


  override fun startSearch(initialQuery: String?, selectInitialQuery: Boolean, appSearchData: Bundle?, globalSearch: Boolean) {
    log.trace("startSearch() initalQuery: $initialQuery selectInitialQuery: $selectInitialQuery appSearchData: $appSearchData globalSearch: $globalSearch")
    super.startSearch(initialQuery, selectInitialQuery, appSearchData, globalSearch)
  }


}