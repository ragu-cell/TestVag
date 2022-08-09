package com.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;

import com.utilities.BaseClass;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;

public class RCBSteps extends BaseClass {
	File file;
	int foriegnplayerCounter = 0;
	JsonPath jsonPath;
	static int length;

	@Given("get rcb player list")
	public void get_rcb_player_list() {
		jsonPath = fileReader();
	}

	@When("to verify the forign players count")
	public void to_verify_the_forign_players_count() {
		length = jsonPath.getInt("player.size");
		ArrayList<String> data = getData(length, "country");
		for (String x : data) {
			if (!(x.equals("India"))) {
				foriegnplayerCounter++;
			}
		}

	}

	@Then("To verify team has maximum four foriegn players")
	public void to_verify_team_has_maximum_four_foriegn_players() {
		System.out.println("Total numbers of forien players are : " + foriegnplayerCounter);
		Assert.assertTrue(foriegnplayerCounter <= 4);
	}



	@Then("to verify team has one wicket keeper")
	public void to_verify_team_has_one_wicket_keeper(io.cucumber.datatable.DataTable dataTable) {
		boolean rolecheck = false;
		List<String> list = dataTable.asList();
		String role = list.get(3);
		System.out.println(role);
		ArrayList<String> roleData = getData(length, "role");
		Iterator<String> iterator = roleData.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if (string.equals(role)) {				
			rolecheck = true;
			break;
			}
		}
			Assert.assertTrue(rolecheck);
	}
}
