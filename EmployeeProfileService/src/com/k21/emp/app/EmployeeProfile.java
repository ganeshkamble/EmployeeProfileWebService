/**
 * 
 */
package com.k21.emp.app;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.k21.emp.dto.EmployeeDTO;

/**
 * @author Ganesh
 *
 */
@WebService(portName = "EmployeeProfileServicePort", serviceName = "EmployeeProfileService")
public class EmployeeProfile {

	private List<String> employeeIds;

	private HashMap<String, EmployeeDTO> employeeProfiles;

	public EmployeeProfile() {
		super();
		populateEmployeeProfiles();
	}

	private void populateEmployeeProfiles() {
		employeeIds = Arrays.asList("101", "102", "103", "104", "105", "106",
				"171", "108", "109", "110");
		employeeProfiles = new HashMap<String, EmployeeDTO>();
		for (String employeeId : employeeIds) {
			EmployeeDTO empDTO = new EmployeeDTO();
			empDTO.setEmployeeId(employeeId);
			empDTO.setDepartment(employeeId + " Department");
			empDTO.setDesignation(employeeId + " Designation");
			empDTO.setName(employeeId + " Name");
			empDTO.setSalary(empDTO.hashCode());
			employeeProfiles.put(employeeId, empDTO);
		}
	}

	@WebMethod(exclude = true)
	public void setEmployeeIds(List<String> employeeIds) {
		this.employeeIds = employeeIds;
	}

	@WebMethod(exclude = true)
	public List<String> getEmployeeIds() {
		return employeeIds;
	}

	@WebMethod(exclude = true)
	public void setEmployeeProfiles(
			HashMap<String, EmployeeDTO> employeeProfiles) {
		this.employeeProfiles = employeeProfiles;
	}

	@WebMethod(exclude = true)
	public HashMap<String, EmployeeDTO> getEmployeeProfiles() {
		return employeeProfiles;
	}

	public EmployeeDTO fetchEmployeeDetails(String employeeId) {
		return employeeProfiles.get(employeeId);
	}

	public String[] fetchAllEmployees() {
		return (String[]) employeeIds.toArray();
	}

	// @WebMethod(exclude = true)
	// public static void main(String[] args) {
	// EmployeeProfile employeeProfile = new EmployeeProfile();
	// System.out.println(employeeProfile.fetchAllEmployees());
	// List<String> employeeIds =
	// Arrays.asList("101","102","103","104","105","106","171","108","109","110");
	// for (String employeeId : employeeIds) {
	// System.out.println(employeeProfile.fetchEmployeeDetails(employeeId));
	// }
	// }

}
