/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_atoi.c                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ombouarg <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/04/23 18:09:48 by ombouarg          #+#    #+#             */
/*   Updated: 2025/04/23 18:14:29 by ombouarg         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <stdlib.h>
#include <ctype.h>
#include <stdio.h>

int	ft_atoi(const char *str)
{
	int	sign;
	int	result;

	sign = 1;
	result = 0;
	while (*str == ' ' || (*str >= '\t' && *str <= '\r'))
		str++;
	if (*str == '-' || *str == '+')
	{
		if (*str == '-')
			sign = -1;
		str++;
	}
	while (isdigit(*str))
	{
		result = result * 10 + (*str - '0');
		str++;
	}
	return (result * sign);
}
/*
int	main(void)
{
	printf("ft_atoi(\"42\") = %d\n", ft_atoi("42"));
	printf("ft_atoi(\"-42\") = %d\n", ft_atoi("-42"));
	printf("ft_atoi(\"   +123\") = %d\n", ft_atoi("   +123"));
	printf("ft_atoi(\"  \\t\\n456\") = %d\n", ft_atoi("  \t\n456"));
	printf("ft_atoi(\"hello\") = %d\n", ft_atoi("hello"));
	printf("ft_atoi(\"123abc\") = %d\n", ft_atoi("123abc"));
	return (0);
}*/
